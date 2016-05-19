package com.github.shanks.rabbit.msg;

import java.io.Serializable;

import lombok.Data;

@Data
public class MessageModel implements Serializable {

	private static final long serialVersionUID = -1216269454239461682L;

	private Long messageId;

	private String messageBody;

}
