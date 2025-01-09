package org.monkey.d.ruffy.ruffy.driver;

import android.os.Binder;
import android.os.IBinder;
import android.os.RemoteException;

public class IRuffyService extends Binder implements IRuffyServiceInterface {
    public IRuffyService() {
        this.attachInterface(this, DESCRIPTOR);
    }

    public static IRuffyServiceInterface asInterface(IBinder obj) {
        if (obj == null) {
            return null;
        }
        IRuffyServiceInterface in = (IRuffyServiceInterface) obj.queryLocalInterface(DESCRIPTOR);
        return (in != null) ? in : new Proxy(obj);
    }

    @Override
    public IBinder asBinder() {
        return this;
    }

    @Override
    public void someMethod() throws RemoteException {
        // Реализация метода
    }

    @Override
    public void setHandler(IRTHandler handler) throws RemoteException {
        // Реализация метода
    }

    private static class Proxy implements IRuffyServiceInterface {
        private IBinder mRemote;

        Proxy(IBinder remote) {
            mRemote = remote;
        }

        @Override
        public IBinder asBinder() {
            return mRemote;
        }

        @Override
        public void someMethod() throws RemoteException {
            // Реализация метода
        }

        @Override
        public void setHandler(IRTHandler handler) throws RemoteException {
            // Реализация метода
        }
    }
}