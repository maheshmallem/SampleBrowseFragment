package mindrock.in;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v17.leanback.widget.ArrayObjectAdapter;
import android.support.v17.leanback.widget.HeaderItem;
import android.support.v17.leanback.widget.ListRow;
import android.support.v17.leanback.widget.ListRowPresenter;
import android.support.v17.leanback.widget.Presenter;
import android.support.v17.leanback.widget.Visibility;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.TextView;

public class BrowseFragment extends android.support.v17.leanback.app.BrowseFragment {
    private static final String TAG = BrowseFragment.class.getSimpleName();

    private ArrayObjectAdapter mArrayObjectAdapter;
    private static final int GRID_ITEM_WIDTH= 300;
    private static final int GRID_ITEM_HEIGHT= 200;

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        setUpUI();
        loadRows();
    }


    private void setUpUI() {
        setTitle("Mind Rock");

        setHeadersState(HEADERS_ENABLED);
        setHeadersTransitionOnBackEnabled(true);

        setBrandColor(Color.RED);

        setSearchAffordanceColor(Color.BLUE);

    }
    private void loadRows() {
        mArrayObjectAdapter =new ArrayObjectAdapter(new ListRowPresenter());

        HeaderItem gridPresenterheader = new HeaderItem(0,"ONE");
        GridItemPresenter gridItemPresenter = new GridItemPresenter();

        ArrayObjectAdapter mRowAdapter=new ArrayObjectAdapter(gridItemPresenter);
        mRowAdapter.add(" ITEM ONE");
        mRowAdapter.add(" ITEM TWO");
        mRowAdapter.add(" ITEM THREE");
        mRowAdapter.add(" ITEM Four");

        HeaderItem gridPresenterheader2 = new HeaderItem(1,"TWO");
        //GridItemPresenter gridItemPresenter = new GridItemPresenter();

        ArrayObjectAdapter mRowAdapter2=new ArrayObjectAdapter(gridItemPresenter);
        mRowAdapter2.add(" ITEM ONE");
        mRowAdapter2.add(" ITEM TWO");
        mRowAdapter2.add(" ITEM THREE");
        mRowAdapter2.add(" ITEM Four");

        HeaderItem gridPresenterheader3 = new HeaderItem(1,"Three");
        //GridItemPresenter gridItemPresenter = new GridItemPresenter();

        ArrayObjectAdapter mRowAdapter3=new ArrayObjectAdapter(gridItemPresenter);
        mRowAdapter3.add(" ITEM ONE");
        mRowAdapter3.add(" ITEM TWO");
        mRowAdapter3.add(" ITEM THREE");
        mRowAdapter3.add(" ITEM Four");

        HeaderItem gridPresenterheader4 = new HeaderItem(2,"Four");
        //GridItemPresenter gridItemPresenter = new GridItemPresenter();

        ArrayObjectAdapter mRowAdapter4=new ArrayObjectAdapter(gridItemPresenter);
        mRowAdapter4.add(" ITEM ONE");
        mRowAdapter4.add(" ITEM TWO");
        mRowAdapter4.add(" ITEM THREE");
        mRowAdapter4.add(" ITEM Four");


        mArrayObjectAdapter.add(new ListRow(gridPresenterheader,mRowAdapter));
        mArrayObjectAdapter.add(new ListRow(gridPresenterheader2,mRowAdapter2));
        mArrayObjectAdapter.add(new ListRow(gridPresenterheader3,mRowAdapter3));
        mArrayObjectAdapter.add(new ListRow(gridPresenterheader4,mRowAdapter4));


        setAdapter(mArrayObjectAdapter);



    }
    private class GridItemPresenter extends Presenter {
        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent) {
            TextView view = new TextView(parent.getContext());
            view.setLayoutParams(new ViewGroup.LayoutParams(GRID_ITEM_WIDTH, GRID_ITEM_HEIGHT));
            view.setFocusable(true);
            view.setFocusableInTouchMode(true);
            view.setBackgroundColor(Color.GRAY);
            view.setTextColor(Color.WHITE);
            view.setGravity(Gravity.CENTER);
            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(ViewHolder viewHolder, Object item) {
            ((TextView) viewHolder.view).setText((String) item);
        }

        @Override
        public void onUnbindViewHolder(ViewHolder viewHolder) {

        }
    }

}
