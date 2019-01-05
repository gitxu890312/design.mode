package com.xum.design.mode.delegate;
/**
 * 
 * @author xum890312
 * 项目经理
 */
public class Dispatch implements IExcutor {
	private IExcutor excutor;

	public Dispatch(IExcutor excutor) {
		this.excutor = excutor;
	}

	@Override
	public void doing() {
		excutor.doing();
	}
}
