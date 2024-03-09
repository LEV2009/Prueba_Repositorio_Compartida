package layouts


class ActivityClientList { AppCompatActivity() {
    private lateinit var binding: ActivityClientListBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityClientListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        



}