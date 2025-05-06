#include <iostream>
using namespace std;

class Stack
{
    int *StackArray;
    int Top, Size, Length;
 public:
    Stack(int InputSize)
    {
        Size = (InputSize > 0) ? InputSize : 10;
        StackArray = new int[Size];
        Top = -1;
        Length = 0;
    }

    bool IsEmpty()
    {
        return Top == -1;
    }

    bool IsFull()
    {
        return Top == Size - 1;
    }

    void Push(int Element)
    {
        if(IsFull())
        {
            cout << "Stack is full" << endl;
            return;
        }
            Top++;
            StackArray[Top] = Element;
    }
    void Pop()
    {
        if(IsEmpty())
        {
            cout << "Stack is empty" << endl;
            return;
        }
            Top--;
    }

    void Display()
    {
        if(IsEmpty())
        {
            cout << "Stack is empty" << endl;
            return;
        }
        else
        {
            for(int Index = Top; Index >= 0; Index--)
            {
                cout << StackArray[Index] << endl;
            }
        }
    }
};



int main()
{
    Stack StackOne(3);
    StackOne.Push(10);
    StackOne.Push(20);
    StackOne.Push(30);
    StackOne.Pop();

    StackOne.Display();
}
