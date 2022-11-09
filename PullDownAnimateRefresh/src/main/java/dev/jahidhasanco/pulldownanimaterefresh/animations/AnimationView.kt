package dev.jahidhasanco.pulldownanimaterefresh.animations

import android.content.Context
import dev.jahidhasanco.pulldownanimaterefresh.operation.RefreshCallbacks
import pl.droidsonroids.gif.GifImageView

abstract class AnimationView(context: Context) : GifImageView(context), RefreshCallbacks