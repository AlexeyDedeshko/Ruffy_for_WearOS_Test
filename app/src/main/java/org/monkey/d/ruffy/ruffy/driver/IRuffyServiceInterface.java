package org.monkey.d.ruffy.ruffy.driver;

import android.os.IInterface;
import android.os.RemoteException;

import org.monkey.d.ruffy.ruffy.driver.IRTHandler;
import org.monkey.d.ruffy.ruffy.driver.IRuffyService;

// Интерфейс, который реализует Stub
public interface IRuffyServiceInterface extends IInterface {
    static final String DESCRIPTOR = "org.monkey.d.ruffy.ruffy.driver.IRuffyServiceInterface";

    void someMethod() throws RemoteException;

    void setHandler(IRTHandler handler) throws RemoteException;

}