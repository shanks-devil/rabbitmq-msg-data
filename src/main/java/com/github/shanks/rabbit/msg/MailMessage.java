package com.github.shanks.rabbit.msg;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class MailMessage extends MessageModel{

	private static final long serialVersionUID = 6354698916743060543L;

	private String ps;
	
}
