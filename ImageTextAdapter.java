    // image and text in Spinner
    // required R.layout.row [R.id.textView, R.id.imageView]
    
    public class ImageTextAdapter extends ArrayAdapter<String> {

        int[] images;

        public ImageTextAdapter(Context ctx, String[] texts, int[] images) {
            super(ctx, android.R.layout.simple_spinner_item, texts);
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

        // TOTRY: comment out this method and run
        @Override
        public View getDropDownView(int position, View convertView, ViewGroup parent) {
            return getView(position, convertView, parent);
        }
    }

