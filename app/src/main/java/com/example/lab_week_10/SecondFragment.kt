package com.example.lab_week_10

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.Observer
import android.widget.TextView
import com.example.lab_week_10.viewmodels.TotalViewModel

class SecondFragment : Fragment() {

    private lateinit var viewModel: TotalViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = ViewModelProvider(requireActivity())[TotalViewModel::class.java]

        val textOutput = view.findViewById<TextView>(R.id.text_output)

        viewModel.total.observe(viewLifecycleOwner, Observer { total ->
            textOutput.text = "From Second Fragment = $total"
        })
    }
}
