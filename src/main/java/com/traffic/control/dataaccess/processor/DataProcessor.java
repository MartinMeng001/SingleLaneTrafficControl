package com.traffic.control.dataaccess.processor;

public interface DataProcessor<T> {
    void process(T data);
}
