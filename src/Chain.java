/**
 * @author kyle
 * created at 12.10.2021
 */
public class Chain {
    private ChainElement chainElement;

    /**
     * @param o The object to add to the chain
     */
    public void add(Object o) {
        if (this.chainElement == null) {
            this.chainElement = new ChainElement(o);
            return;
        }
        ChainElement tempChainElement = chainElement;
        while (tempChainElement.getNext() != null) {
            tempChainElement = tempChainElement.getNext();
        }
        tempChainElement.setNext(new ChainElement(o));
    }

    /**
     * @param index Index of the object to get
     * @return Returns null or the object in chainElement with the given index
     */
    public Object get(int index) {
        if (this.chainElement == null) {
            throw new IndexOutOfBoundsException();
        }
        ChainElement chainElement = this.chainElement;
        for (int i = 1; i <= index; i++) {
            if (chainElement.getNext() == null) {
                throw new IndexOutOfBoundsException();
            }
            chainElement = chainElement.getNext();
        }
        return chainElement.getData();
    }

    /**
     * Removes the head element of the chain
     */
    public void remove() {
        ChainElement chainElement = this.chainElement;
        this.chainElement = chainElement.getNext();
    }

    /**
     * @return The size of the complete chain
     */
    public int size() {
        int size = 1;
        ChainElement tempChainElement = chainElement;
        while (tempChainElement.getNext() != null) {
            tempChainElement = tempChainElement.getNext();
            size++;
        }
        return size;
    }
}
