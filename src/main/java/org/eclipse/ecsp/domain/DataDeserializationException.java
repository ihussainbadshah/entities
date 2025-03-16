package org.eclipse.ecsp.domain;

/**
 * DataDeserializationException Class.
 */
public class DataDeserializationException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    /**
     * Initialize with message.
     *
     * @param msg : String
     */
    public DataDeserializationException(String msg) {
        super(msg);
    }

    /**
     * Initialize with msg and throwable.
     *
     * @param msg : String
     * @param throwable : Throwable
     */
    public DataDeserializationException(String msg, Throwable throwable) {
        super(msg, throwable);
    }
}
