package org.javaswift.joss.command.impl.container;

import org.javaswift.joss.command.shared.identity.access.AccessImpl;
import org.javaswift.joss.model.Account;
import org.javaswift.joss.command.impl.core.AbstractSecureCommand;
import org.javaswift.joss.model.Container;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpRequestBase;

public abstract class AbstractContainerCommand<M extends HttpRequestBase, N> extends AbstractSecureCommand<M, N> {

    public AbstractContainerCommand(Account account, HttpClient httpClient, AccessImpl access, Container container) {
        super(account, httpClient, access.getInternalURL() + "/" + container.getName(), access.getToken());
    }
}
