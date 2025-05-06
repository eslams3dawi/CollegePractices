#include <iostream>
using namespace std;

class LinkedList
{
    public:
    struct Node
    {
        int Data;
        Node *Next;

        Node(int Element)
        {
            Data = Element;
            Next = NULL;
        }
    };

    Node* Head;

    LinkedList()
    {
        Head = NULL;
    }

    bool IsEmpty()
    {
        return Head == NULL;
    }

    void InsertFirst(int Element) // 1 2 3 || 4 1 2 3
    {
        Node *NewNode = new Node(Element);
        if(IsEmpty())
        {
            Head = NewNode;
        }
        else
        {
            NewNode->Next = Head;
            Head = NewNode;
        }
    }

    void InsertAfterFirst(int Element) // 4 1 2 3 || 4 5 1 2 3
    {
        if(IsEmpty())
        {
            InsertFirst(Element);
        }
        else
        {
            Node *NewNode = new Node(Element);
            NewNode->Next = Head->Next;
            Head->Next = NewNode;
        }
    }

    void InsertAtPosition(int Value ,int Element)
    {
        Node *NewNode = new Node(Element);
        if(IsEmpty())
        {
            InsertFirst(Element);
        }
        else
        {
            Node *BeforePosition = Head;
            while(BeforePosition->Next->Data != Value)
            {
                BeforePosition = BeforePosition->Next;
            }
            NewNode->Next = BeforePosition->Next;
            BeforePosition->Next = NewNode;
        }
    }

    void DeleteFirst()
    {
        if(IsEmpty())
        {
            cout << "list is empty" << endl;
        }
        else
        {
            Node *DeletedTemp = Head;
            Head = Head->Next;
            delete DeletedTemp;
        }
    }

    void DeleteLast()
    {
        if(IsEmpty())
        {
            cout << "list is empty" << endl;
        }
        else if(Head->Next == NULL)
        {
            DeleteFirst();
        }
        else
        {
            Node *BeforeTail = Head;
            while(BeforeTail->Next->Next != NULL)
            {
                BeforeTail = BeforeTail->Next;
            }
            delete BeforeTail->Next;
            BeforeTail->Next = NULL;
        }
    }

    void DeleteAtPosition(int Value)
    {
        if(Head->Data == Value)
        {
            DeleteFirst();
        }

        Node *BeforePosition = Head;
        while(BeforePosition->Next->Data != Value)
        {
            BeforePosition = BeforePosition->Next;
        }
        Node *DeletedNode = BeforePosition->Next;
        BeforePosition->Next = BeforePosition->Next->Next;
        delete DeletedNode;
    }


    void Display()
    {
        if(IsEmpty())
        {
            cout << "list is empty" << endl;
        }
        else
        {
            Node *Current = Head;
            while(Current != NULL)
            {
                cout << Current->Data << " ";
                Current = Current->Next;
            }
            cout << endl;
        }
    }
};


int main()
{
    LinkedList List;
    List.InsertFirst(10);
    List.InsertAfterFirst(20);
    List.InsertAfterFirst(30);
    List.InsertAtPosition(20, 40);

    //List.DeleteFirst();
    List.DeleteLast(); // 10 30 40
    List.DeleteAtPosition(30);

    List.Display(); // 10 30 40 20
}
