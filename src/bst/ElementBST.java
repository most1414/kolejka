package bst;

import kolejka2.Element;

public class ElementBST {
    int wartosc;
    ElementBST prawySyn;
    ElementBST lewySyn;
    ElementBST ojciec;

    public ElementBST(int wartosc) {
        this.wartosc = wartosc;
        prawySyn = null;
        lewySyn = null;
        ojciec = null;
    }

    public ElementBST getOjciec() {
        return ojciec;
    }

    public void setOjciec(ElementBST ojciec) {
        this.ojciec = ojciec;
    }

    public int getWartosc() {
        return wartosc;
    }

    public void setWartosc(int wartosc) {
        this.wartosc = wartosc;
    }

    public ElementBST getPrawySyn() {
        return prawySyn;
    }

    public void setPrawySyn(ElementBST prawySyn) {
        this.prawySyn = prawySyn;
    }

    public ElementBST getLewySyn() {
        return lewySyn;
    }

    public void setLewySyn(ElementBST lewySyn) {
        this.lewySyn = lewySyn;
    }
}
