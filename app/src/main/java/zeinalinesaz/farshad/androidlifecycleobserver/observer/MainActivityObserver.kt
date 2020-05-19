package zeinalinesaz.farshad.androidlifecycleobserver.observer

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

class MainActivityObserver: LifecycleObserver
{
    private val TAG=MainActivityObserver::class.java.simpleName

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun onCreateObserver()
    {
        Log.i(TAG,"onCreateObserver")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun onStartObserver()
    {
        Log.i(TAG,"onStartObserver")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun onResumeObserver()
    {
        Log.i(TAG,"onResumeObserver")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun onPauseObserver()
    {
        Log.i(TAG,"onPauseObserver")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun onStopObserver()
    {
        Log.i(TAG,"onStopObserver")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun onDestroyObserver()
    {
        Log.i(TAG,"onDestroyObserver")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_ANY)
    fun onAnyObserver()
    {
        Log.i(TAG,"onAnyObserver")
    }
}