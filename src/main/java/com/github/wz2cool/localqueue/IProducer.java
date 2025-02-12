package com.github.wz2cool.localqueue;

import com.github.wz2cool.localqueue.event.CloseListener;

/**
 * producer interface.
 *
 * @author Frank
 */
public interface IProducer extends AutoCloseable {

    /**
     * offer message to queue.
     *
     * @param message message
     * @return true if success
     */
    boolean offer(String message);

    /**
     * offer message to queue.
     *
     * @param messageKey message key
     * @param message    message
     * @return true if success
     */
    boolean offer(String messageKey, String message);

    /**
     * offer message to queue
     *
     * @param tag        tag
     * @param messageKey message key
     * @param message    message
     * @return true if success
     */
    boolean offer(String tag, String messageKey, String message);

    /**
     * is closed
     *
     * @return true if closed
     */
    boolean isClosed();

    /**
     * close producer.
     */
    void close();

    /**
     * add close listener.
     *
     * @param listener close listener
     */
    void addCloseListener(CloseListener listener);
}
