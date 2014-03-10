/*
 * Copyright (C) 2012 Mikael Ståldal
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package nu.staldal.djdplayer;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public abstract class CategoryFragment extends BrowserFragment implements MusicUtils.Defs {
    private static final String LOGTAG = "CategoryFragment";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ListView listView = new ListView(getActivity());
        listView.setId(android.R.id.list);
        listView.setFastScrollEnabled(true);
        listView.setTextFilterEnabled(true);

        registerForContextMenu(listView);

        return listView;
    }

    protected void viewCategory(String categoryId, String id, boolean editMode) {
        ((MusicBrowserActivity)getActivity()).showSongsInCategory(categoryId, id, editMode);
    }
}
