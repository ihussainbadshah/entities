package org.eclipse.ecsp.entities;

/**
 * InvalidDataFormat Exception Class.
 */
public class InvalidDataFormatException  extends RuntimeException {
    
    /**
     * version uid.
     */
    private static final long serialVersionUID = 87765789323L;

    /**
     * Initialize with msg.
     *
     * @param msg : String
     */
    public InvalidDataFormatException(String msg) {
        super(msg);
    }
}
