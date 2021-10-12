/**
 * @author kyle
 * created at 12.10.2021
 */
public class ChainElement {
    private final Object data;
    private ChainElement next;

    /**
     * @param data Data to add to this chainElement node
     */
    public ChainElement(Object data) {
        this.data = data;
    }

    /**
     * @return Returns the next chainElement node
     */
    public ChainElement getNext() {
        return next;
    }

    /**
     * @param next Sets the next chainElement node
     */
    public void setNext(ChainElement next) {
        this.next = next;
    }

    /**
     * @return Returns the data of this chainElement node
     */
    public Object getData() {
        return data;
    }
}
