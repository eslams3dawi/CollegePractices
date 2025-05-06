#include <iostream>
using namespace std;

class BST
{
    struct Node
    {
        int Data;
        Node *Left, *Right;

        Node(int Element)
        {
            Data = Element;
            Left = Right = NULL;
        }
    };
    public:
    Node *Root;

    BST()
    {
        Root = NULL;
    }

    Node* Insert(Node *PNode, int Element)
    {
        Node *NewNode = new Node(Element);
        if(PNode == NULL)
        {
            PNode = NewNode;
        }
        else if(Element <= PNode->Data)
        {
            PNode->Left = Insert(PNode->Left, Element);
        }
        else if(Element > PNode->Data)
        {
            PNode->Right = Insert(PNode->Right, Element);
        }
        return PNode;
    }

    void InsertValue(int Element)
    {
        Root = Insert(Root, Element);
    }

    void Preorder(Node *PNode)
    {
        if(PNode == NULL)
        {
            return;
        }
        cout << PNode->Data << " ";
        Preorder(PNode->Left);
        Preorder(PNode->Right);
    }

    void Inorder(Node *PNode)
    {
        if(PNode == NULL)
        {
            return;
        }
        Inorder(PNode->Left);
        cout << PNode->Data << " ";
        Inorder(PNode->Right);
    }

    void Postorder(Node *PNode)
    {
        if(PNode == NULL)
        {
            return;
        }
        Postorder(PNode->Left);
        Postorder(PNode->Right);
        cout << PNode->Data << " ";
    }
};

void Menu()
{
    cout << "[1] Insert" << endl;
    cout << "[2] Preorder" << endl;
    cout << "[3] Inorder" << endl;
    cout << "[4] Postorder" << endl;
    cout << "[0] Exit" << endl;
}
int main()
{

    int Option, Times, Value;
    BST Tree;
    while(1)
    {
        Menu();
        cout << "Choose an option" << endl;
        cin >> Option;

        switch(Option)
        {
        case 1:
            cout << "How many value that you want to insert ? : ";
            cin >> Times;
            while(Times--)
            {
                cin >> Value;
                Tree.InsertValue(Value);
                cout << "The values that not be inserted yet (" << Times << ")" << endl;
            }
            break;
        case 2:
            Tree.Preorder(Tree.Root);
            cout << endl;
            break;
        case 3:
            Tree.Inorder(Tree.Root);
            cout << endl;
            break;
        case 4:
            Tree.Postorder(Tree.Root);
            cout << endl;
            break;
        case 0:
            return 0;
        default:
            cout << "Invalid option, please try again" << endl;
            break;
        }
    }
}












