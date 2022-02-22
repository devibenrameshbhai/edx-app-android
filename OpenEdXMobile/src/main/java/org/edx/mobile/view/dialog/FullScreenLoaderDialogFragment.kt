package org.edx.mobile.view.dialog

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import org.edx.mobile.R
import org.edx.mobile.databinding.DialogFullScreenLoaderBinding

class FullScreenLoaderDialogFragment : DialogFragment() {

    private lateinit var binding: DialogFullScreenLoaderBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStyle(
            STYLE_NORMAL,
            R.style.AppTheme_NoActionBar
        )
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = DialogFullScreenLoaderBinding.inflate(inflater)
        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance(): FullScreenLoaderDialogFragment {
            return FullScreenLoaderDialogFragment()
        }
    }
}
