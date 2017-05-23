package org.cuieney.videolife.kotlin.di.component

import android.app.Activity
import dagger.Component
import org.cuieney.videolife.di.PerFragment
import org.cuieney.videolife.di.component.AppComponent
import org.cuieney.videolife.kotlin.di.module.FragmentModule
import org.cuieney.videolife.kotlin.ui.EssayHomeFragment
import org.cuieney.videolife.ui.fragment.essay.EssayHomeDetailFragment
import org.cuieney.videolife.ui.fragment.music.MusicHomeFragment
import org.cuieney.videolife.ui.fragment.video.VideoHomeFragment

/**
 * Created by cuieney on 2017/5/22.
 */

@PerFragment
@Component(dependencies = arrayOf(AppComponent::class), modules = arrayOf(FragmentModule::class))
interface FragmentComponent{
     fun getActivity(): Activity

     fun inject(videoFragment: VideoHomeFragment)
     fun inject(musicFragment: MusicHomeFragment)
     fun inject(essayFragment: EssayHomeFragment)
     fun inject(homeDetailFragment: EssayHomeDetailFragment)
}