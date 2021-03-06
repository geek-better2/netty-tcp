package com.chauncy.datadev.codc;

import com.chauncy.datadev.utils.CodecUtils;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;


/**
 * Created by chauncy on 2018/5/29.
 */
public class KMDecoder extends ByteToMessageDecoder {

    private final Logger logger = LoggerFactory.getLogger(KMDecoder.class);

    @Override
    protected void decode(ChannelHandlerContext ctx, ByteBuf buf, List<Object> out) throws Exception {

        Object o = CodecUtils.getObject(buf);
        if (o != null) {
            out.add(o);
        }


    }


}
