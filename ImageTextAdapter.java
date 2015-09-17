    // tested with Spinner
    
    public class ImageTextAdapter extends ArrayAdapter<String> {

        int[] images;

        public ImageTextAdapter(Context ctx, String[] texts, int[] images) {
            super(ctx, R.layout.row, texts);
            this.images = images;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View row = getLayoutInflater().inflate(R.layout.row, parent, false);

            TextView textView = (TextView) row.findViewById(R.id.textView);
            textView.setText(getItem(position));

            ImageView imageView = (ImageView) row.findViewById(R.id.imageView);
            imageView.setImageResource(images[position]);

            return row;
        }

        @Override
        public View getDropDownView(int position, View convertView, ViewGroup parent) {
            return getView(position, convertView, parent);
        }
    }
