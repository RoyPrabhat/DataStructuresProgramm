//public class Dummy {
//    Camera hardware;
//    void onResume() {
//        hardware = new Camera();
//        hardware.start();
//        hardware.addListener(() -> {
//        });
//
//
//        soluiton
////        var h = new Camera();
////        hardware = h;
////        hardware.start();
////        hardware.addListener(() -> {
////            if ( h != hardware ) {
////                h.close();
////            }
////        })
//    }
//
//    void onPause() {
//        hardware.close();
//        hardware = null;
//    }
//}
//class Camera {
//    private Object resource;
//    Listener listeneer;
//    void start() {
//        // Initialize and lock the camera resource. This methods takes 2 seconds to
//        // complete and give callback.
//        initAndLockCamera((internalPointer) -> {
//            Log.d(TAG, "Hardware respource locked");
//            this.resource = internalPointer
//            listener?.call();
//        });
//    }
//    void close() {
//        if ( resource != null ) {
//            resource.release();
//            resource = null; // only place where resource is getting set as null
//        }
//    }
//
//}
