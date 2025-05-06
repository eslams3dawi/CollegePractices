#include <iostream>
using namespace std;

class BST
{
public:
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

    Node* Root;
    BST()
    {
        Root = NULL;
    }
    Node* Insert(Node* PNode, int Element)
    {
        Node* NewNode = new Node(Element);
        if(PNode == NULL)
        {
            PNode = NewNode;
        }
        else if(Element < PNode->Data)
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

    void Preorder(Node* PNode) // ROOT, LEFT, RIGHT
    {
        if(PNode == NULL)
            return;
        cout << PNode->Data << " ";
        Preorder(PNode->Left);
        Preorder(PNode->Right);
    }
    void Inorder(Node* PNode) // LEFT, ROOT, RIGHT
    {
        if(PNode == NULL)
            return;
        Inorder(PNode->Left);
        cout << PNode->Data << " ";
        Inorder(PNode->Right);
    }
    void Postorder(Node* PNode) // LEFT, RIGHT, ROOT
    {
        if(PNode == NULL)
            return;
        Postorder(PNode->Left);
        Postorder(PNode->Right);
        cout << PNode->Data << " ";
    }
};

void Menu()
{
    cout << "[1] Insert " << endl;
    cout << "[2] Display in preorder " << endl;
    cout << "[3] Display in inorder " << endl;
    cout << "[4] Display in postorder " << endl;
    cout << "[0] exit" << endl;
}

int main()
{
    BST Tree;

    while(1)
    {
        Menu();
        cout << "choose an option : ";
        int Option;
        cin >> Option;

        switch(Option)
        {
        case 1:
            cout << "How many values that you want to insert ? : ";
            int Times;
            cin >> Times;
            for(int Index = 0; Index < Times; Index++)
            {
                cout << "#" << Index + 1 << ": ";
                int ElementValue;
                cin >> ElementValue;
                Tree.InsertValue(ElementValue);
            }
            cout << "All values inserted successfully !" << endl;
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









