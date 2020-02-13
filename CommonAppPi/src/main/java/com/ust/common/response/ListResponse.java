package com.ust.common.response;


public class ListResponse<T> extends Response {
    private T data;
    
    public ListResponse(T t) {
    	this.data = t;
    }

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
    
    
}