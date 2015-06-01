package com.jonathanduque.maestrodetalle;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;
import android.webkit.WebView;


import com.jonathanduque.maestrodetalle.dummy.DummyContent;

/**
 * A fragment representing a single Page detail screen.
 * This fragment is either contained in a {@link PageListActivity}
 * in two-pane mode (on tablets) or a {@link PageDetailActivity}
 * on handsets.
 */
public class PageDetailFragment extends Fragment {
    /**
     * The fragment argument representing the item ID that this fragment
     * represents.
     */
    public static final String ARG_ITEM_ID = "item_id";

    /**
     * The dummy content this fragment is presenting.
     */
    private DummyContent.DummyItem mItem;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public PageDetailFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments().containsKey(ARG_ITEM_ID)) {
            // Load the dummy content specified by the fragment
            // arguments. In a real-world scenario, use a Loader
            // to load content from a content provider.
            mItem = DummyContent.ITEM_MAP.get(getArguments().getString(ARG_ITEM_ID));
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_page_detail, container, false);

        // Show the dummy content as text in a TextView.
        if (mItem != null) {
            switch(Integer.parseInt(mItem.id)) {
                case 0:
                    AboutGuarne aboutguarne = new AboutGuarne();
                    this.getFragmentManager().beginTransaction()
                            .replace(R.id.page_detail_container, aboutguarne)
                            .addToBackStack(null)
                            .commit();
                    break;
                case 1:
                    Bares bares = new Bares();
                    this.getFragmentManager().beginTransaction()
                            .replace(R.id.page_detail_container, bares)
                            .addToBackStack(null)
                            .commit();
                    break;
                case 2:
                    Hoteles hoteles = new Hoteles();
                    this.getFragmentManager().beginTransaction()
                            .replace(R.id.page_detail_container, hoteles)
                            .addToBackStack(null)
                            .commit();
                    break;
                case 3:
                    Sitios sitios = new Sitios();
                    this.getFragmentManager().beginTransaction()
                            .replace(R.id.page_detail_container, sitios)
                            .addToBackStack(null)
                            .commit();
                    break;
                case 4:
                    AboutUs aboutus= new AboutUs();
                    this.getFragmentManager().beginTransaction()
                            .replace(R.id.page_detail_container, aboutus)
                            .addToBackStack(null)
                            .commit();
                    break;
                case 5:
                    //((WebView) rootView.findViewById(R.id.detail_web)).loadUrl("http://www.guarne-antioquia.gov.co/index.shtml#7");
                    ((TextView) rootView.findViewById(R.id.page_detail)).setText(Contenido.descripcion[Integer.parseInt(mItem.id)]);
                    break;
                default:
                    //((TextView) rootView.findViewById(R.id.page_detail)).setText(Contenido.descripcion[Integer.parseInt(mItem.id)]);
                    break;
            }
        }

            return rootView;
    }
}
