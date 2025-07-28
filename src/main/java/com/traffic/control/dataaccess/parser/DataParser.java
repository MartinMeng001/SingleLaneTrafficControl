package com.traffic.control.dataaccess.parser;

import com.traffic.control.common.exception.DataParseException;
import com.traffic.control.common.model.ProtocolMessage;

public interface DataParser<T> {
    T parse(ProtocolMessage message) throws DataParseException;
    boolean canParse(ProtocolMessage message);
}
