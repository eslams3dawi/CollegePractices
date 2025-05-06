#include <iostream>
using namespace std;

class Queue
{
    public:
    int *QueueArray;
    int Front, Rear, Size, Length;

    Queue(int InputSize)
    {
        Size = (InputSize > 0) ? InputSize : 50;
        QueueArray = new int[Size];
        Front = Rear = -1;
        Length = 0;
    }

    bool IsEmpty()
    {
        return Length == 0;
    }

    bool IsFull()
    {
        return Length == Size;
    }
    void Enqueue(int Element) // 1 2 3
    {
        if(IsFull())
        {
            cout << "Queue is full" << endl;
            return;
        }
        else if (IsEmpty())
        {
            Front = Rear = 0;
        }
        else
        {
            Rear = (Rear + 1) % Size;
        }
        QueueArray[Rear] = Element;
        Length++;
    }

    void Dequeue() // 3
    {
        if(IsEmpty())
        {
            cout << "Queue is empty" << endl;
            return;
        }
        else
        {
            Front = (Front + 1) % Size;
            Length--;
        }
    }
    void Display()
    {
        for(int Index = Front; Index <= Rear; Index++)
        {
            cout << QueueArray[Index] << " ";
        }
        cout << endl;
    }
};


int main()
{
    Queue QueueOne(3);
    QueueOne.Enqueue(10);
    QueueOne.Enqueue(20);
    QueueOne.Enqueue(30);

    QueueOne.Dequeue();

    QueueOne.Display();
}
