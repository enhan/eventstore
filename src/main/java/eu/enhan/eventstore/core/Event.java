package eu.enhan.eventstore.core;

import static com.google.common.base.Preconditions.*;
import org.joda.time.DateTime;


/**
 * An event is the central object in Eventstore.
 *
 */
public class Event {

	private String name;

	private String description;

	private DateTime startTime;


	public Event(String name, String description, DateTime startTime) {
		this.name = checkNotNull(name);
		this.description = checkNotNull(description);
		this.startTime = checkNotNull(startTime);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public DateTime getStartTime() {
		return startTime;
	}

	public void setStartTime(DateTime startTime) {
		this.startTime = startTime;
	}
}
