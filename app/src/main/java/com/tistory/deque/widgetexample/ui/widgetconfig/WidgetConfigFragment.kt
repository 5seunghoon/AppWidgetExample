package com.tistory.deque.widgetexample.ui.widgetconfig

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.tistory.deque.widgetexample.R
import com.tistory.deque.widgetexample.WidgetConfigActivity
import kotlinx.android.synthetic.main.widget_config_fragment.*

class WidgetConfigFragment : Fragment() {

    companion object {
        fun newInstance() = WidgetConfigFragment()
    }

    private lateinit var viewModel: WidgetConfigViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.widget_config_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(WidgetConfigViewModel::class.java)

        frag_button?.setOnClickListener {
            (activity as? WidgetConfigActivity)?.clickFragButton()
        }
    }

}
