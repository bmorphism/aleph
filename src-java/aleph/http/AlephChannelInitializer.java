package aleph.http;

import clojure.lang.IFn;
import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;

public class AlephChannelInitializer extends ChannelInitializer<Channel> {
    
    private final IFn chanBuilderFn;
    
    public AlephChannelInitializer(IFn chanBuilderFn) {
        this.chanBuilderFn = chanBuilderFn;
    }

    @Override
    protected void initChannel(Channel ch) throws Exception {
        chanBuilderFn.invoke(ch);
    }
}
