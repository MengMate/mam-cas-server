package cn.mam.handler;

import org.apache.http.auth.UsernamePasswordCredentials;
import org.apereo.cas.authentication.AuthenticationHandler;
import org.apereo.cas.authentication.AuthenticationHandlerExecutionResult;
import org.apereo.cas.authentication.Credential;
import org.apereo.cas.authentication.PreventedException;
import java.security.GeneralSecurityException;

/**
 * @author mam
 */
public class CustomerHandler implements AuthenticationHandler {
    @Override
    public AuthenticationHandlerExecutionResult authenticate(Credential credential) throws GeneralSecurityException, PreventedException {
        return null;
    }

    @Override
    public boolean supports(Credential credential) {
        return credential instanceof UsernamePasswordCredentials;
    }
}
