package com.standardset.camel;

import org.springframework.stereotype.Service;

/**
 * Implementation of the RemoteService interface
 */
@Service ("remoteServiceServer")
public class RemoteServiceImpl implements RemoteService {
    @Override
    public String getText(final String input) {
        return
            String.format(
                "Hello World, %s!",
                input
            );
    }
}
