package dev.jahidhasanco.pulldownanimaterefresh.animations

import android.content.Context
import com.airbnb.lottie.LottieAnimationView
import dev.jahidhasanco.pulldownanimaterefresh.operation.RefreshCallbacks

abstract class LottieAnimationView(context: Context) : LottieAnimationView(context),
    RefreshCallbacks