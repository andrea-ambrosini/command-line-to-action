package org.rossonet.command.parser.action;

public class CommandParserException extends RuntimeException {

	private static final long serialVersionUID = -6018039925116047330L;

	public CommandParserException() {
		super();
	}

	public CommandParserException(final String message) {
		super(message);
	}

	public CommandParserException(final String message, final Throwable cause) {
		super(message, cause);
	}

	public CommandParserException(final String message, final Throwable cause, final boolean enableSuppression,
			final boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public CommandParserException(final Throwable cause) {
		super(cause);
	}

}
