public class Worker {
    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback) { //, OnTaskErrorListener errorCallback
        this.callback = callback;
        this.errorCallback = errorCallback;
    }


    public void start() {
        for (int i = 0; i < 100; i++) {
            if (i == 33) {
                errorCallback.onError("Task " + i + " is Error");
                //  callback.onDone("Task " + i + " is Error");
            } else {
                callback.onDone("Task " + i + " is done");
            }
        }
    }
}