package org.eclipse.ecsp.domain;

/**
 * InvalidBlobSource Exception Class.
 */
public class InvalidBlobSourceException extends RuntimeException {
    
    /**
     * Constructor.
     *
     * @param msg : String
     */
    public InvalidBlobSourceException(String msg) {
        super(msg);
    }
}
