package com.github.shanks.rabbit.msg;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class BasketBallMessage extends MessageModel {

	private static final long serialVersionUID = -3344653638848866426L;

	private String score;
	
	private String winner;
	
	private String loser;
	
}
