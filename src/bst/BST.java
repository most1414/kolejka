package bst;

import kolejka2.Element;

import java.util.LinkedList;
import java.util.List;

public class BST {
    static ElementBST root;

    public BST(){
        root = null;
    }

    public static void main(String[] args) {

        BST.dodajWezel(10);
        BST.dodajWezel(6);
        BST.dodajWezel(21);
        BST.dodajWezel(3);
        BST.dodajWezel(7);
        BST.dodajWezel(15);
        BST.dodajWezel(20);
        BST.dodajWezel(8);
        BST.dodajWezel(2);

//        System.out.println("            "+root.getWartosc());
//        System.out.println("         "+root.getLewySyn().getWartosc()+"             "+root.getPrawySyn().getWartosc());
        pokazDrzewoBST(root);
        pokazInOrder(root);

        }

        static void dodajWezel(int wartosc){

        ElementBST biezacyElement = new ElementBST(wartosc);
        if (root == null) root = biezacyElement;
        else {
            sprawdzIDodaj(root,biezacyElement);
        }




        }

    private static void sprawdzIDodaj(ElementBST ojciec,ElementBST nowyElement) {
        if (nowyElement.getWartosc()>= ojciec.getWartosc()) {
            if (ojciec.getPrawySyn() == null) ojciec.setPrawySyn(nowyElement);
            else sprawdzIDodaj(ojciec.getPrawySyn(), nowyElement);
        }else{
            if (ojciec.getLewySyn()== null) ojciec.setLewySyn(nowyElement);
            else sprawdzIDodaj(ojciec.getLewySyn(), nowyElement);
        }

    }
    private static  void pokazDrzewoBST(ElementBST element){

        pokazJedenWezel(root);

    }
    private static void pokazJedenWezel(ElementBST element){
        System.out.println("        "+element.getWartosc());
        if (element.getLewySyn()!= null) System.out.println("      "+element.getLewySyn().getWartosc());
        if (element.getPrawySyn()!= null) System.out.println("      "+element.getLewySyn().getWartosc());
    }

    private static void pokazInOrder(ElementBST root){
        if (root.getLewySyn()!= null)pokazInOrder(root.getLewySyn());
        System.out.printf(" "+root.getWartosc());
        if(root.getPrawySyn() != null) pokazInOrder(root.getPrawySyn());

    }

}

