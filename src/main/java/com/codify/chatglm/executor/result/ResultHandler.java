package com.codify.chatglm.executor.result;


import okhttp3.sse.EventSourceListener;

//结果封装
public interface ResultHandler {
    EventSourceListener eventSourceListener(EventSourceListener eventSourceListener);
}
