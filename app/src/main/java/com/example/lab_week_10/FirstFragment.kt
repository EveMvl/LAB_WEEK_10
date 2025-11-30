package com.example.lab_week_10

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import android.widget.Button
import android.widget.TextView
import com.example.lab_week_10.viewmodels.TotalViewModel

class FirstFragment : Fragment() {

    private lateinit var viewModel: TotalViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = ViewModelProvider(requireActivity())[TotalViewModel::class.java]

        val textTotal = view.findViewById<TextView>(R.id.text_total)
        val buttonNext = view.findViewById<Button>(R.id.button_next)

        viewModel.total.observe(viewLifecycleOwner, Observer { total ->
            textTotal.text = "Total: $total"
        })

        buttonNext.setOnClickListener {
            findNavController().navigate(R.id.action_first_to_second)
        }
    }
}
