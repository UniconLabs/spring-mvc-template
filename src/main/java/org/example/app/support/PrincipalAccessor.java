package org.example.app.support;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * Simple utility class to simplify access to the current Spring Security <code>UserDetails</code>
 *
 * @author Dmitriy Kopylenko
 * @author Unicon, inc.
 */
public final class PrincipalAccessor {

	/**
	 * Non-instantiable
	 */
	private PrincipalAccessor() {
	}

	private static UserDetails currentPrincipal() {
		return UserDetails.class.cast(SecurityContextHolder.getContext().getAuthentication().getPrincipal());
	}

	public static String currentPrincipalId() {
		return currentPrincipal().getUsername();
	}
}
