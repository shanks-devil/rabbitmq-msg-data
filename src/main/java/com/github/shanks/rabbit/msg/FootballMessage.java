package com.github.shanks.rabbit.msg;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class FootballMessage extends MessageModel {

	private static final long serialVersionUID = -7651722580203983659L;

	private String score;
	
	private String winner;
	
	private String loser;
}
