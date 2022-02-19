package cz.muni.aqicheck.ui.list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import cz.muni.aqicheck.databinding.FragmentListBinding

class ListFragment : Fragment() {

    // TODO 8. ListFragment binding
    private lateinit var binding: FragmentListBinding

    // TODO 9. onCreateView
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = FragmentListBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
}