package com.hc.crashlibary.save;

import com.hc.crashlibary.encryption.IEncryption;

/**
 * 保存日志与崩溃信息的接口
 * Created by wenmingvs on 2016/7/7.
 */
public interface ISave {

    void writeLog(String tag, String content);

    void writeCrash(Thread thread, Throwable ex, String tag, String content);

    void setEncodeType(IEncryption encodeType);

}
