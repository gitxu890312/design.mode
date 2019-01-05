package com.xum.design.mode.delegate;

public class DispatchTest {

	public static void main(String[] args) {
		Dispatch patch = new Dispatch(new ExcutorA());
		patch.doing();
	}
}
