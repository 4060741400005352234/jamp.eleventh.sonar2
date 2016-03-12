package jamp.nineth;

import jamp.nineth.util.StringUtil;

/**
 * Request checker
 * @author Yevgeniy Popov
 */
public class RequestHolder {

    /**
     * Method for validating request
     * @param request string with request
     * @return validation flag
     */
    public boolean requestIsValid(String request) {
        return StringUtil.isEmpty(request);
    }
}
