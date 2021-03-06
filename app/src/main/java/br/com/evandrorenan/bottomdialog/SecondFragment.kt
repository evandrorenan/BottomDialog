package br.com.evandrorenan.bottomdialog

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class SecondFragment : BottomSheetDialogFragment() {

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
//        this.dialog?.window?.setBackgroundDrawableResource(R.drawable.rounded_corner)
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.bt_update_app).setOnClickListener {
            Toast.makeText(this.requireActivity(), "Click", Toast.LENGTH_SHORT).show()
        }
    }
}