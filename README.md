# ViewBindingDelegationKT

```gradle
android {
    ...
    buildFeatures {
        viewBinding true
    }
}

dependencies {
    ...
    //maven { url 'https://jitpack.io' }
    implementation 'com.github.yogacp:android-viewbinding:1.0.3'
}
```

- Example On Activity
```kotlin
class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by viewBinding()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.tvHello.text = "Hello Zein"
    }
}
```
```xml
<TextView
    android:id="@+id/tv_hello"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="Hello World!" />
```

- Example On Fragment
```kotlin
class BlankFragment : Fragment(R.layout.fragment_blank) {

    private val binding: FragmentBlankBinding by viewBinding()

//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
//    ): View? {
//        return inflater.inflate(R.layout.fragment_blank, container, false)
//    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.tvHello.text = "Hello Zein"
    }
}
```
```xml
<TextView
    android:id="@+id/tv_hello"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="Hello World!" />
```

---

```
Copyright 2021 M. Fadli Zein
```