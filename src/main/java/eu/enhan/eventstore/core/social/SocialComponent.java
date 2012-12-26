package eu.enhan.eventstore.core.social;

import org.springframework.social.connect.Connection;
import org.springframework.social.connect.ConnectionSignUp;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Signup component. Implicit signup using social connections
 *
 * By now this does nothing useful
 */
public class SocialComponent implements ConnectionSignUp{

	private final AtomicLong sequence = new AtomicLong();

	@Override
	public String execute(Connection<?> connection) {
		return Long.toString(sequence.incrementAndGet());
	}
}
