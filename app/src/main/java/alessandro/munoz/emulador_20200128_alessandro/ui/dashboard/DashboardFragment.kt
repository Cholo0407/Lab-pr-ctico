package alessandro.munoz.emulador_20200128_alessandro.ui.dashboard

import alessandro.munoz.emulador_20200128_alessandro.R
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import alessandro.munoz.emulador_20200128_alessandro.databinding.FragmentDashboardBinding
import android.widget.Button
import android.widget.Toast

class DashboardFragment : Fragment() {

    private var _binding: FragmentDashboardBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val dashboardViewModel =
            ViewModelProvider(this).get(DashboardViewModel::class.java)

        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        val root: View = binding.root


        val btnPerfil = root.findViewById<Button>(R.id.btnVerPerfil)


        btnPerfil.setOnClickListener {
            Toast.makeText(this.context, "Alessandro Antonio Muñoz Quijada", Toast.LENGTH_LONG).show()
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}