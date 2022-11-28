package bitflyday.com.mobile.application.a2activityrdiff

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import androidx.navigation.findNavController
import androidx.navigation.ui.*
import bitflyday.com.mobile.application.a2activityrdiff.databinding.ActivityContentBinding
import com.google.android.material.snackbar.Snackbar

class ContentActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
private lateinit var binding: ActivityContentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

     binding = ActivityContentBinding.inflate(layoutInflater)
     setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        val navController = findNavController(R.id.nav_host_fragment_content_content)
        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.nav_graph
            ), drawerLayout = null
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        binding.toolbar.setNavigationOnClickListener(View.OnClickListener {
            this.onBackPressed()
        })

        binding.fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
    }

    override fun onSupportNavigateUp(): Boolean {
    val navController = findNavController(R.id.nav_host_fragment_content_content)
    return navController.navigateUp(appBarConfiguration)
            || super.onSupportNavigateUp()
    }
}